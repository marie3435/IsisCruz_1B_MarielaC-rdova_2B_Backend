package ProyectoFinal.eventosprestige.api.modules.salones.controller;

public class SalonController {
    @Autowired private SalonService salonService;

    @GetMapping publicResponseEntity<ApiResponse<List<Salon>>> listar()
    { return ResponseEntity.ok(new ApiResponse<>(true, "Lista de salones cargada", salonService.obtenerTodos())); }
    @GetMapping("/{id}") publicResponseEntity<ApiResponse<Salon>> buscarPorId(@PathVariable Long id) { try { return ResponseEntity.ok(newApiResponse<>(true, "Salón encontrado", salonService.obtenerPorId(id)));}
    } catch (Exception e)
    { returnResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse<>(false, e.getMessage())); } }
@PostMappingpublic ResponseEntity<ApiResponse<Salon>> crear(@RequestBody SalonRequestDTO dto)
{ try { Salon nuevo = salonService.guardar(dto);}
    return ResponseEntity.status(HttpStatus.CREATED) .body(new ApiResponse<>(true, "Salón registrado con éxito", nuevo));
} catch (IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(newApiResponse < > (false,e.getMessage()));
        }
}

