# Prometheus/Grafana

## 参考
[Prometheus+Grafanaを自分のWindows PCだけで15分で体感する](https://qiita.com/fujiyamaegg/items/452ea39fd638d195c105)

[AlwaysUpを使用してPrometheusをWindowsサービスとしてインストールする方法](https://www.coretechnologies.com/products/AlwaysUp/Apps/InstallPrometheusAsAWindowsService.html)

### メトリクス
http://localhost:8080/actuator/prometheus

### Prometheus
http://localhost:9090

参考のprometheus.ymlあり

### Grafana
http://localhost:3000

- 初期設定
    1. 構成>データソース>データソースの追加
    2. URL：http：// prometheus：9090
    3. セーブ
    4. ダッシュボード>管理>インポート
    5. https://grafana.com/grafana/dashboards/4701
        1. このサイトでいろんなダッシュボードが来てており、設定をダウンロードします。
        2. IDをクリップボードにコピー
    6. 負荷