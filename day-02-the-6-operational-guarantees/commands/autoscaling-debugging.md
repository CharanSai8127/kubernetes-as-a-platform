# Autoscaling Debugging

## Check HPA Status

    kubectl get hpa

Used to inspect:
- replica scaling
- workload pressure
- autoscaling behavior

---

## Describe HPA

    kubectl describe hpa <hpa-name>

Useful for:
- scaling metrics
- stabilization behavior
- scaling events
- workload thresholds

---

## Check Current Replica State

    kubectl get deployment

Helps validate:
- desired replicas
- available replicas
- rollout coordination
- scaling stability

---

## Monitor Node Capacity

    kubectl top nodes

Used to identify:
- node pressure
- resource exhaustion
- infrastructure scaling requirements

---

## Inspect Pending Pods

    kubectl get pods --field-selector=status.phase=Pending -A

Useful for debugging:
- insufficient infrastructure
- scheduling failure
- autoscaling coordination issues

---

## View Cluster Autoscaler Logs

    kubectl logs -n kube-system deployment/cluster-autoscaler

Helps analyze:
- node provisioning decisions
- infrastructure elasticity
- scale-up coordination

---

# Key Insight

Autoscaling debugging focuses on understanding elasticity behavior under changing workload and infrastructure pressure.
