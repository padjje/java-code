import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


abstract public class BaseTest extends Base {

    @BeforeAll
    static void beforeAll() {
        setUpWebDriver();
        setupAllureListener();
    }

    @AfterAll
    public static void afterAll() {
        tearDown();
    }
}

