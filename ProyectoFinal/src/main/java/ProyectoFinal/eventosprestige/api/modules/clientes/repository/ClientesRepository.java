package ProyectoFinal.eventosprestige.api.modules.clientes.repository;

public class ClientesRepository extends jpaRepository<ClientesE>{
    public interface ClienteRepository extends JpaRepository<Cliente, Long> { boolean existsByEmail(String email);boolean existsByEmailAndIdClienteNot(String email, Long idCliente); }


}
