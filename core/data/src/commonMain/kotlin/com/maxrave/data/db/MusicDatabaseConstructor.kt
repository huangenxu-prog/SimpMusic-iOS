package com.maxrave.data.db

import androidx.room.RoomDatabaseConstructor

/**
 * Allows Room to generate the platform-specific database constructor for KMP targets.
 */
@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object MusicDatabaseConstructor : RoomDatabaseConstructor<MusicDatabase>
