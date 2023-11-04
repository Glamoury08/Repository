import javax.swing.JOptionPane
import javax.swing.JOptionPane.showConfirmDialog as confirm
import javax.swing.JOptionPane.showInputDialog as input



fun main() {


    val data = input(
        null,
        "Welcome to our restaurant, what would you like to order?\n" +
                "1) NationalDish\n" +
                "2) Turkish Dish\n" +
                "3) Fast Food"
    )



    when (data.toInt()) {
        1 -> confirm(null, "You want to eat National Dish",)
        2 -> confirm(null, "You want to eat Turkish Dish",)
        3 -> confirm(null, "You want to eat Fast Food",)
        else -> JOptionPane.showConfirmDialog(null, "You entered wrong number")
    }
    when (data.toInt()) {
        1 -> confirm(null, "This was a trick taste!",)
        2 -> confirm(null, "This was a trick taste!",)
        3 -> confirm(null, "You want to eat Fast Food",)
        else -> JOptionPane.showConfirmDialog(null, "You entered wrong number")

}

