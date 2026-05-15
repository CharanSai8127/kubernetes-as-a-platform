# Metrics Debugging Commands

## Check Metrics Availability

kubectl exec -it <pod-name> -- curl localhost:8080/metrics

---

## Verify PodMonitor

kubectl get podmonitor -A

kubectl describe podmonitor <podmonitor-name> -n monitoring

---

## Verify ServiceMonitor

kubectl get servicemonitor -A

kubectl describe servicemonitor <servicemonitor-name> -n monitoring

---

## Check Scrape Targets

kubectl port-forward svc/prometheus-operated 9090:9090 -n monitoring

Open:
http://localhost:9090/targets

---

## Verify Exporters

kubectl get pods -n monitoring

---

## Check Metric Labels

kubectl exec -it <pod-name> -- curl localhost:8080/metrics | less

---

## Verify Metric Cardinality

kubectl top pods -n monitoring

---

## Check Failed Scrapes

kubectl logs <prometheus-pod> -n monitoring
