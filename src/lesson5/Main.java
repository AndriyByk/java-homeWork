package lesson5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/java_homework", "root", "rootroot");

            PreparedStatement statement = connection.prepareStatement("use java_homeWork");
            PreparedStatement statement0 = connection.prepareStatement("create table if not exists people(\n" +
                    "    id int not null auto_increment primary key,\n" +
                    "    name varchar(30) default 'none',\n" +
                    "    age int default 0,\n" +
                    "    email varchar(30) default 'none',\n" +
                    "    status boolean default false\n);");

            PreparedStatement statement1 = connection.prepareStatement("insert into people values (default, 'Andriy', 25, 'andriy@abc.abc', true)");
            PreparedStatement statement2 = connection.prepareStatement("insert into people values (default, 'Taras', 30, 'taras@abc.abc', false)");
            PreparedStatement statement3 = connection.prepareStatement("insert into people values (default, 'Tamara', 28, 'tamara@abc.abc', true)");
            PreparedStatement statement4 = connection.prepareStatement("insert into people values (default, 'Petro', 18, 'petro@abc.abc', false)");
            PreparedStatement statement5 = connection.prepareStatement("insert into people values (default, 'Olesia', 45, 'olesia@abc.abc', true)");
            PreparedStatement statement6 = connection.prepareStatement("insert into people values (default, 'Ostap', 33, 'ostap@abc.abc', true)");

            statement.executeUpdate();
            statement0.executeUpdate();
            statement1.executeUpdate();
            statement2.executeUpdate();
            statement3.executeUpdate();
            statement4.executeUpdate();
            statement5.executeUpdate();
            statement6.executeUpdate();

            PreparedStatement selectStatement = connection.prepareStatement(
                    "select id, age, email, status from people where status=true");
            ResultSet resultSet = selectStatement.executeQuery();
            ArrayList<Person> people = new ArrayList<>();
            while (resultSet.next()) {
                people.add(new Person(
                        resultSet.getInt("id"),
                        resultSet.getInt("age"),
                        resultSet.getString("email"),
                        resultSet.getBoolean("status")));
            }

            List<Person> peopleList = people.stream()
                    .sorted((person1, person2) -> person1.getAge() - person2.getAge())
                    .collect(Collectors.toList());
            System.out.println(peopleList);

            PreparedStatement dropStatement = connection.prepareStatement("drop table people");
            dropStatement.executeUpdate();

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
