# Grafana Debugging Commands

## Check Grafana Pods

kubectl get pods -n monitoring

---

## Describe Grafana Pod

kubectl describe pod <grafana-pod> -n monitoring

---

## Check Grafana Logs

kubectl logs <grafana-pod> -n monitoring

---

## Port Forward Grafana

kubectl port-forward svc/grafana 3000:80 -n monitoring

Open:
http://localhost:3000

---

## Verify Dashboard ConfigMaps

kubectl get configmap -n monitoring

---

## Check Grafana Datasources

kubectl get secret -n monitoring

---

## Restart Grafana Deployment

kubectl rollout restart deployment grafana -n monitoring

---

## Verify Persistent Volumes

kubectl get pvc -n monitoring

kubectl describe pvc <pvc-name> -n monitoring
