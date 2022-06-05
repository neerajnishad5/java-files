/**
 * @author Neeraj Nishad
 * @version 2.0
 * @since 2022
 * 
 * 
 */

package Javadoc;
/**
 * Class for library book
 */

public class Book {
    /**
     * @value 10 default
     */
    static int val = 10;

    /**
     * Parameterized constructor
     * @param name book name
     * 
     */

    public Book(String name) {

    }
    /**
     * Issue a book to a student
     * @param roll rollNumber of a student
     * @throws Exception if book is not availabel throws exception
     */

    public void issue(int roll) throws Exception {

    }
    /**
     * check if book is available
     * @param str book name 
     * @return if book is present returns true
     */

    public boolean available(String str) {
        return true;
    }
    /**
     * Get book name
     * @param id book id
     * @return book name
     */

    public String getname(int id) {
        return "";
    }

}