class ColorCode(hex: String = "", rgb: String = "") {
    var code: String
    var rgb: Boolean = false
    var hex: Boolean = false

    init{

        if(hex.isEmpty() && rgb.isEmpty()) {
            throw IllegalArgumentException("ColorCode must have either a hex or rgb value")
        }

        if(!hex.isEmpty()) {
            this.code = hex
            this.hex = true
        } else {
            this.code = rgb
            this.rgb = true
        }

    }

}


class  Category (name: String, color_code: ColorCode) {
    var name: String
    var color_code: ColorCode
    var active: Boolean = false

    companion object {
        var  active_categories_count: Int = 0
        var categories = mutableListOf<Category>()


    }

    init {
        this.name = name
        this.color_code = color_code

        categories.add(this)
    }


    fun activate() {

        if(this.active){
            if(active_categories_count < 3) {
                active = true
                active_categories_count++
            }

            else{
                throw Exception("You can't have more than 3 active categories")
            }
        }

        throw Exception("Category is already active")

    }

    fun deactivate() {

        if(this.active) {
            active = false
            active_categories_count--
        }

        else{
            throw Exception("This category is already deactivated")
        }
 
    }


}

fun main() {

    var color_code = ColorCode(hex = "#FF0000")
    var cat = Category("Food", color_code)


}