package me.prettyprint.cassandra.model;

import java.util.List;

// multiget_slice. returns Rows
public interface MultigetSliceQuery extends AbstractSliceQuery<Rows> {

  SliceQuery setKeys(List<String> key);

}