package com.nao20010128nao.Phosphorus.phar.events

/**
 * Created by nao on 2017/02/09.
 */
class RawFileEvent(val raw: ByteArray, val manifest: FileManifestEvent) : PharParserEvent {

    override val id: Int = PharParserEvent.ID_RAW_FILE
}
