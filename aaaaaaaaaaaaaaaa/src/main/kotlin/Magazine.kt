class Magazine(override var price: Int, override var wordCount: Int) : Publication {

    override fun getType(): String {
        return "Magazine"
    }

    override fun out(): String {
        return "Price = $price euro, Word Count = $wordCount and Type = ${getType()} "
    }
}