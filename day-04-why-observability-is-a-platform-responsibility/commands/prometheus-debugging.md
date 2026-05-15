# Prometheus Debugging Commands

## Check Prometheus Pods

kubectl get pods -n monitoring

---

## Describe Prometheus Pod

kubectl describe pod <prometheus-pod> -n monitoring

---

## Check Prometheus Logs

kubectl logs <prometheus-pod> -n monitoring

---

## Verify Prometheus Targets

kubectl port-forward svc/prometheus-operated 9090:9090 -n monitoring

Open:
http://localhost:9090/targets

---

## Check Prometheus Rules

kubectl get prometheusrules -A

---

## Check ServiceMonitors

kubectl get servicemonitors -A

---

## Verify Metrics Endpoint

kubectl exec -it <pod-name> -- curl localhost:8080/metrics

---

## Check Resource Pressure

kubectl top pods -A

kubectl top nodes

---

## Verify Namespace Monitoring

kubectl get servicemonitor -A -o wide
