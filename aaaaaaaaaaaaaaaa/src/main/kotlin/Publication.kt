interface Publication {
    val price: Int
    val wordCount: Int

    fun getType(): String
    fun out(): String
}
