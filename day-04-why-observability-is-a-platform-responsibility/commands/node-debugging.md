# Node Debugging Commands

## Check Node Status

kubectl get nodes

---

## Describe Node

kubectl describe node <node-name>

---

## Check Node Pressure

kubectl top nodes

---

## Verify node-exporter Pods

kubectl get pods -n monitoring -l app.kubernetes.io/name=node-exporter

---

## Check node-exporter Logs

kubectl logs <node-exporter-pod> -n monitoring

---

## Verify Node Metrics

kubectl exec -it <node-exporter-pod> -n monitoring -- wget -qO- localhost:9100/metrics

---

## Check Disk Pressure

kubectl describe node <node-name> | grep Pressure

---

## Verify Resource Saturation

kubectl top pods -A --sort-by=cpu

kubectl top pods -A --sort-by=memory

---

## Check Node Events

kubectl get events --sort-by=.metadata.creationTimestamp
