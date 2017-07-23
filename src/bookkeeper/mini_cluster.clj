(ns bookkeeper.mini-cluster
  (:gen-class
   :extends org.apache.bookkeeper.test.BookKeeperClusterTestCase
   :name bookkeeper.mini-cluster.Shim
   :exposes {zkUtil {:get getZkUtil :set setZkUtil}})
  (:import [bookkeeper.mini-cluster Shim]))

(defn create
  "Create a local bookkeeper cluster, but doesn't start it"
  [bookies]
  (Shim. bookies))

(defn start
  "Start a previously created bookkeeper cluster"
  [cluster]
  (.setUp cluster))

(defn kill
  "Kill a bookkeeper cluster"
  [cluster]
  (.tearDown cluster))

(defn zookeeper-connect-string
  "Get the zookeeper connect string for a cluster"
  [cluster]
  (.getZooKeeperConnectString (.getZkUtil cluster)))
