# Argo CD As Deployment Controller

Argo CD operates as:
- a GitOps deployment controller for Kubernetes.

It continuously reconciles:
- cluster state
toward:
- the desired configuration stored in Git.

---

# Why Argo CD Matters

Argo CD improves:
- deployment ownership
- rollback capability
- auditability
- and operational visibility.

---

# Operational Workflow

CI pipeline validates artifact
→ Git repository updated
→ Argo CD detects manifest changes
→ Cluster reconciles automatically

---

# Separation Benefits

CI no longer requires:
- direct production cluster access.

This reduces:
- operational blast radius
- and security exposure.

---

# Drift Detection

Argo CD continuously identifies:
- configuration drift
between:
- desired state
and:
- runtime cluster state.

---

# Key Insight

GitOps controllers improve deployment safety by separating validation systems from production reconciliation systems.
