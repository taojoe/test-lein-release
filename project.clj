(defproject test-lein-release "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot test-lein-release.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
