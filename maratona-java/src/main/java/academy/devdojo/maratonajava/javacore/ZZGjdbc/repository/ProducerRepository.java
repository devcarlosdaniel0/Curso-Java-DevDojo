package academy.devdojo.maratonajava.javacore.ZZGjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZGjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZGjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer in database, rows affected '{}'", rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
