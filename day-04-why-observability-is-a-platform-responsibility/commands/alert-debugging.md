# Alert Debugging Commands

## Check Alertmanager Pods

kubectl get pods -n monitoring

---

## Describe Alertmanager Pod

kubectl describe pod <alertmanager-pod> -n monitoring

---

## Check Alertmanager Logs

kubectl logs <alertmanager-pod> -n monitoring

---

## Port Forward Alertmanager

kubectl port-forward svc/alertmanager-operated 9093:9093 -n monitoring

Open:
http://localhost:9093

---

## Verify Prometheus Rules

kubectl get prometheusrules -A

---

## Describe PrometheusRule

kubectl describe prometheusrule <rule-name> -n monitoring

---

## Check Active Alerts

kubectl port-forward svc/prometheus-operated 9090:9090 -n monitoring

Open:
http://localhost:9090/alerts

---

## Verify Alertmanager Config

kubectl get secret -n monitoring

---

## Restart Alertmanager

kubectl rollout restart statefulset alertmanager-kube-prometheus-stack-alertmanager -n monitoring

---

## Check Alert Noise

kubectl logs <alertmanager-pod> -n monitoring | grep alert
