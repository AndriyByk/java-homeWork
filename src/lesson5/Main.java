package lesson5;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/java_homework", "root", "rootroot");

            PreparedStatement statement = connection.prepareStatement("use java_homeWork");
            PreparedStatement statement0 = connection.prepareStatement("create table if not exists people(\n" +
                    "    id int not null auto_increment primary key,\n" +
                    "    name varchar(30) default 'none',\n" +
                    "    age int default 0,\n" +
                    "    email varchar(30) default 'none'\n" +
                    ");");
//            PreparedStatement statement = connection.prepareStatement("create table people(" +
//                    " id int not null auto_increment primary key," +
//                    " name varchar(30) default 'none'," +
//                    " age int default 0," +
//                    " email varchar(30) default 'none'");
            PreparedStatement statement1 = connection.prepareStatement("insert into people values (default, 'Andriy', 25, 'andriy@abc.abc')");
            PreparedStatement statement2 = connection.prepareStatement("insert into people values (default, 'Taras', 30, 'taras@abc.abc')");
            PreparedStatement statement3 = connection.prepareStatement("insert into people values (default, 'Tamara', 28, 'tamara@abc.abc')");
            statement.executeUpdate();
            statement0.executeUpdate();
            statement1.executeUpdate();
            statement2.executeUpdate();
            statement3.executeUpdate();
            PreparedStatement selectStatement = connection.prepareStatement("select id, age, email from people");
            ResultSet resultSet = selectStatement.executeQuery();
            ArrayList<Person> people = new ArrayList<>();
            while (resultSet.next()) {
                people.add(new Person(
                        resultSet.getInt("id"),
                        resultSet.getInt("age"),
                        resultSet.getString("email")));
            }
            System.out.println(people);

            PreparedStatement dropStatement = connection.prepareStatement("drop table people");
            dropStatement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
