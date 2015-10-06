package edu.ntnu.sigbjornlo.codecs.hello;

import org.apache.lucene.codecs.FilterCodec;
import org.apache.lucene.codecs.lucene53.Lucene53Codec;

/**
 * Created by sigbjornlo on 06/10/15.
 */
public class HelloCodec extends FilterCodec {
    public HelloCodec() {
        super("HelloCodec", new Lucene53Codec());
    }
}
