// TODO: Add package declaration
package inventory;

/**
 * Represents a single game title available in the shop.
 * Access modifiers are chosen to enforce least privilege.
 */
public class Item {

    // TODO: Declare fields with appropriate access modifiers
    // name, genre, stockCount -> private
    // serialCode              -> private (no public getter!)
    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    public Item(String name, String genre, int stockCount, String serialCode) {
        // TODO: Initialize all fields
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    // TODO: Public getters for name, genre, stockCount only
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    /**
     * Package-private: accessible within game.inventory, hidden from outside.
     * Used by Inventory for auditing purposes.
     */
    // TODO: Declare getSerialCode() with NO access modifier (package-private)
    String getSerialCode() {
        return serialCode;
    }

    /**
     * Private helper: checks whether enough stock exists.
     */
    private boolean isAvailable(int quantity) {
        // TODO: Return true if stockCount >= quantity
        return stockCount >= quantity;
    }

    /**
     * Reduces stock by the given quantity if available.
     * Prints a warning if stock is insufficient.
     */
    public void sell(int quantity) {
        // TODO: Use isAvailable() to check stock before selling
        //       If available: reduce stockCount, print confirmation
        //       If not: print warning message, do NOT change stockCount
        if (isAvailable(quantity)) {
            stockCount -= quantity;
            System.out.println("Sold " + quantity + " copy/copies of " + name + ". Remaining stock: " + stockCount);
        } else {
            System.out.println("WARNING: Not enough stock for " + name + ". Requested: " + quantity + ", Available: " + stockCount);
        }
    }
}
