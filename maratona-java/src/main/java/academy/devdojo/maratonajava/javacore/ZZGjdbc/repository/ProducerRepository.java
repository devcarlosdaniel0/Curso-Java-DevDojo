package academy.devdojo.maratonajava.javacore.ZZGjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZGjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZGjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void insert(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in database, rows affected '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from database, rows affected '{}'", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    public static void deleteBetween(int idInicio, int idFinal) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` between '%d' and '%d');".formatted(idInicio, idFinal);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer id '{}' to '{}' from database, rows affected '{}'", idInicio, idFinal, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer id '{}' to '{}'", idInicio, idFinal, e);
        }
    }
}
