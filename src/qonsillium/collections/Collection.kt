package qonsillium.collections

abstract class Collection(val parameters: Array<String>) {
    abstract fun getCollection(): CollectionUnitList
}