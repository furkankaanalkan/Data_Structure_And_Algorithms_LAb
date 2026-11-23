public class BrowserDemo {
    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();

        // STEP 1: Visit three webpages.
        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.goBack();

        browser.visit("Facebook.com");
        browser.goBack();

        // STEP 3: Go forward once.
        browser.goForward();

        // STEP 4: Visit a new webpage.
        browser.visit("stackoverflow.com");

        // STEP 5: Display the current webpage.
        browser.displayCurrentPage();

        // STEP 6: Display the complete browser history.
        browser.displayHistory();
    }
}



/*
=====================================================================
D. ANALYSIS
=====================================================================

1. What is the current page after each operation?
Operation               Current page
----------------------------------------
Initial state           null
Visit Google            google.com
Visit YouTube           youtube.com
Go back                 google.com
Visit Facebook          Facebook.com
Go back                 google.com
Go forward              Facebook.com
Visit StackOverflow     stackoverflow.com

2. What happens to the forward stack when a new page is visited?
- The forward stack is completely cleared (emptied) because visiting a 
  new webpage starts a new navigation branch, invalidating the previous 
  forward history.

3. Why are stacks appropriate for this problem?
- Browser navigation follows the LIFO (Last-In, First-Out) principle: 
  the most recently visited page is always the first one returned to 
  when going back, and the most recently backed-out page is the first 
  one restored when going forward.

4. Time complexity of each method:
Method          Time Complexity         Explanation
---------------------------------------------------------------------
push()          O(1)                    Creates a new node and updates the top pointer in constant time.
pop()           O(1)                    Retrieves top data and moves top to top.next in constant time.
peek()          O(1)                    Directly accesses top.data without traversing the list.
visit()         O(n) (Worst Case)      Pushing to backStack is O(1), but clearStack(forwardStack) pops all n elements in forwardStack one by one.
goBack()        O(1)                    Uses only isEmpty(), push(), and pop(), all of which take constant time.
goForward()     O(1)                    Uses only isEmpty(), push(), and pop(), all of which take constant time.
=====================================================================
*/
