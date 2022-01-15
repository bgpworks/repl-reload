(defproject org.clojars.bgpworks/repl-reload "0.1.4-SNAPSHOT"
  :description "Reloads the repl on file change"
  :url "https://github.com/bgpworks/repl-reload"
  :license {:name "EPL-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3" :scope "provided"]
                 [org.clojure/tools.namespace "1.2.0"]
                 [ns-tracker "0.4.0"]]
  :deploy-repositories [["releases" :clojars]]
  :repl-options {:init-ns repl-reload.core})
