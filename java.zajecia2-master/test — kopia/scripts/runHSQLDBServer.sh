#!/bin/bash

java -cp I:/hsqldb-2.4.0/hsqldb/lib/hsqldb.jar org.hsqldb.server.Server --database.0 mem:mydb --dbname.0 workdb
