package com.example.exposedspringtransaction.app.models

import com.example.exposedspringtransaction.app.tables.Posts
import org.jetbrains.exposed.dao.UUIDEntity
import org.jetbrains.exposed.dao.UUIDEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import java.util.*

class Post(id: EntityID<UUID>) : UUIDEntity(id) {
    companion object : UUIDEntityClass<Post>(Posts)

    var name by Posts.name
}
