package qonsillium.collections

class CollectionUnitList {
    var units: Array<CollectionUnit> = arrayOf(CollectionUnit())
        set(unit) {
            field = unit
        }
        get() = field
}