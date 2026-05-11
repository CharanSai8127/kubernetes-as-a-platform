# Networking Commands

Networking is one of the most critical operational layers in Kubernetes.

Even when workloads are healthy, networking failures can prevent communication between:
- users and applications
- services and workloads
- frontend and backend systems
- or workloads across namespaces

These commands help inspect Kubernetes networking behavior and connectivity.

---

# Verify Services

Services provide workload discovery and traffic abstraction.

```bash
kubectl get svc -A
kubectl describe svc <service-name>
