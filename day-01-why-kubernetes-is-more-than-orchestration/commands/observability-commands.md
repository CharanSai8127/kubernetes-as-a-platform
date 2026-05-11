# Observability Commands

Observability helps understand the state of Kubernetes platforms across:
- infrastructure
- applications
- networking
- and workload behavior

Production systems rely on observability to:
- detect failures
- troubleshoot incidents
- identify bottlenecks
- and improve operational reliability

Observability commonly includes:
- metrics
- logs
- traces
- and events

---

# View Pod Logs

Logs help explain why failures occurred.

```bash
kubectl logs <pod-name>
