/**
 * Created by Taylor Lanclos on 6/18/18
 */
package dev.boysnberries.projectretrospection.data.database.entity

import android.arch.persistence.room.*


@Entity(tableName = "category_buckets", foreignKeys = [
    ForeignKey(
            entity = Question::class,
            parentColumns = ["id"],
            childColumns = ["questionID"],
            onDelete = ForeignKey.NO_ACTION
    )
])
data class CategoryBucket(
        @PrimaryKey(autoGenerate = true) val id: Long?,
        val questionID: Long,
        @ColumnInfo(name = "allowed_value") val allowedValue: String,
        @ColumnInfo(name = "rank") val rank: Int?
) {
    constructor() : this(null, Long.MAX_VALUE, "", null)
}
