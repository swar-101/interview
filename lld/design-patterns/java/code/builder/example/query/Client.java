package query;

public class Client {
    public static void main(String[] args) {
        Query query = new Query.Builder()
                .setSelect("username")
                .setFrom("user")
                .setWhere("user.user_id < 123")
                .setJoin("employee ON user.user_id = employee.user_id")
                .setGroupBy("user.user_id")
                .setOrderBy("employee_id")
                .build();
        // This is just an example. Don't take the SQL query quite literally.
        System.out.println(query.toString());
    }
}
