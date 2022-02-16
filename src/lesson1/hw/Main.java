//створити клас, який би описував подібні об'єкти
//        https://jsonplaceholder.typicode.com/posts/1
//
//та клас який описував би подіюні об'єкти
//        https://jsonplaceholder.typicode.com/comments/1

package lesson1.hw;

public class Main {
    public static void main(String[] args) {
        Post post = new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
        Comment comment = new Comment(1,1,"id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");
    }
}
