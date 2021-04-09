package Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import DAO.Cliente;
import DAO.DataJson;

@RestController
@RequestMapping("api/Cliente")
public class ClienteController {

    
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
    private DataJson datajson = new DataJson();


    @RequestMapping(value = "/",  method = RequestMethod.POST)
    public DataJson getClient(){
        String sql = "select top 10  * from tratblcliente WHERE PLATINUM_CARD <> '' ";
        List<Cliente> customers = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Cliente.class));
         
        datajson.setValue(customers);
        return datajson;
     }

}
