(defproject bookkeeper-clj "0.1.4-SNAPSHOT"
  :description "Clojure client for bookkeeper"
  :url "http://github.com/ivankelly/bookkeeper-clj"
  :license {:name "Apache License, Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [manifold "0.1.6"]
                 [org.apache.bookkeeper/bookkeeper-server "4.6.1"
                  :exclusions [[org.slf4j/slf4j-log4j12]]]
                 [org.apache.bookkeeper/bookkeeper-server "4.6.1"
                  :classifier "tests"
                  :exclusions [[org.slf4j/slf4j-log4j12]]]
                 [org.apache.zookeeper/zookeeper "3.4.6"
                  :classifier "tests"
                  :exclusions [[org.slf4j/slf4j-log4j12]]]
                 [junit/junit "4.12"]]
  :aot [bookkeeper.mini-cluster]
  :deploy-repositories [["releases" :clojars]])
