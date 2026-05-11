# Desired State and Reconciliation

One of the most important concepts in Kubernetes is desired-state management.

Instead of manually controlling infrastructure continuously, Kubernetes allows operators to define the expected system state declaratively.

The platform then continuously works to reconcile the current state toward the desired state.

---

# Desired State

Desired state represents the expected configuration of the system.

Examples include:
- number of application replicas
- container images
- exposed Services
- resource limits
- autoscaling behavior
- and deployment configuration

Example:

```yaml
spec:
  replicas: 3
