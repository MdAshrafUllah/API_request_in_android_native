data class Product(
    val BrandName: String,
    val CategoryName: String,
    val ChildList: List<List<Int>>,
    val Code: String,
    val ColorName: String,
    val CostPrice: Int,
    val CreateDate: String,
    val CurrentStock: Int,
    val Description: String,
    val Id: Int,
    val ImagePath: Any,
    val ModelName: String,
    val Name: String,
    val OldPrice: Int,
    val ParentCode: String,
    val Price: Int,
    val ProductBarcode: String,
    val SizeName: String,
    val Type: String,
    val UnitName: String,
    val UpdateDate: String,
    val VariantName: String,
    val WarehouseList: List<Warehouse>
)