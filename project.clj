(defproject playsync "0.1.0-SNAPSHOT"
  :description "Core-Async Sample App"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]
  :main ^:skip-aot playsync.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
