# Rollout Debugging Commands

Deployment failures can introduce:
- application outages
- unstable releases
- unavailable workloads
- and rollback requirements

These commands help inspect rollout behavior, deployment status, and ReplicaSet revisions.

---

# Verify Deployments

Used to inspect deployment status across namespaces.

```bash
kubectl get deployments -A
kubectl describe deployment <deployment-name>
