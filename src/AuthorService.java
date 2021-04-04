
import java.util.HashSet;
import java.util.Set;

public class AuthorService {
    private Set<Author> listAuthors;
    private static AuthorService instance = null;

    private AuthorService() {
        listAuthors = new HashSet<>();
    }

    public static AuthorService getInstance() {
        if(instance == null) {
            instance = new AuthorService();
        }
        return instance;
    }

    public void addAuthor(Author addedAuthor) {
        boolean exists = false;
        for(Author a : listAuthors)
            if (a.equals(addedAuthor)) {
                exists = true;
                break;
            }
        if(!exists) {
            listAuthors.add(new Author(addedAuthor));

        }
    }



    public void showAuthors() {
        for(Author a : listAuthors)
            System.out.println(a.toString());
    }
}
