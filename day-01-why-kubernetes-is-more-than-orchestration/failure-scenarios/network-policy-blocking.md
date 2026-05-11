# NetworkPolicy Blocking Communication

NetworkPolicies control communication between workloads inside Kubernetes clusters.

Improper policy configuration can unintentionally block traffic between services.

---

# Common Scenarios

## Frontend Cannot Reach Backend

Ingress rules may deny frontend traffic toward backend workloads.

Result:
Applications fail internally despite healthy Pods.

---

## DNS Traffic Blocked

DNS communication may become restricted unintentionally.

Result:
Applications cannot resolve internal or external services.

---

## Namespace Isolation Issues

Cross-namespace communication may fail because of restrictive NetworkPolicies.

Result:
Distributed systems become partially unreachable.

---

# Operational Impact

Improper NetworkPolicies can result in:
- traffic failures
- timeout errors
- broken service communication
- difficult troubleshooting scenarios

---

# Debugging Commands

```bash
kubectl get networkpolicy
kubectl describe networkpolicy
kubectl exec -it <pod-name> -- nslookup kubernetes.default
