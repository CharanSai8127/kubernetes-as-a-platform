# Traffic Debugging Commands

Traffic failures in Kubernetes can occur across multiple operational layers before requests reach the application workloads.

These commands help inspect:
- traffic admission
- service discovery
- endpoint registration
- routing behavior
- and workload reachability

---

# Verify Gateway Resources

Used to inspect Gateway API resources responsible for admitting traffic into the platform.

```bash
kubectl get gateway -A
kubectl describe gateway <gateway-name>
