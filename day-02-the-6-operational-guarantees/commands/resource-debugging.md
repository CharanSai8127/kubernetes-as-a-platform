# Resource Debugging

## Check Node Resource Usage

    kubectl top nodes

Used to identify:
- node pressure
- CPU saturation
- memory exhaustion
- infrastructure imbalance

---

## Check Pod Resource Usage

    kubectl top pods -A

Helps identify:
- noisy neighbors
- memory leaks
- runaway workloads
- unstable consumption patterns

---

## Describe a Pod

    kubectl describe pod <pod-name>

Useful for:
- OOMKilled events
- eviction analysis
- resource scheduling failures
- restart behavior

---

## Check Pending Pods

    kubectl get pods --field-selector=status.phase=Pending -A

Used to identify:
- scheduling starvation
- insufficient infrastructure capacity
- resource exhaustion

---

## Check Cluster Autoscaler Behavior

    kubectl logs -n kube-system deployment/cluster-autoscaler

Helps debug:
- node scale-up decisions
- unschedulable workloads
- autoscaling coordination

---

## Check Resource Requests and Limits

    kubectl get pod <pod-name> -o yaml

Useful for validating:
- requests
- limits
- workload resource governance

---

# Key Insight

Resource debugging is fundamentally about understanding workload pressure and infrastructure predictability under changing operational demand.
