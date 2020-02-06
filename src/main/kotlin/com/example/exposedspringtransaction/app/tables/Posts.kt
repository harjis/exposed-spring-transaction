package com.example.exposedspringtransaction.app.tables

import org.jetbrains.exposed.dao.id.UUIDTable

object Posts : UUIDTable() {
    val name = varchar("name", 255)
}
