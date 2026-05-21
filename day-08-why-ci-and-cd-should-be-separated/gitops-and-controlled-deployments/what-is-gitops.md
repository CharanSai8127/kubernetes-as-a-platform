# What Is GitOps

GitOps is a deployment model where:
- Git becomes the operational source of truth.

Deployment systems continuously reconcile:
- cluster state
with:
- declarative configuration stored in Git.

---

# Why GitOps Exists

Direct production mutation creates:
- inconsistent deployments
- reduced auditability
- and operational drift.

GitOps improves:
- deployment control
- rollback safety
- and operational visibility.

---

# Core Workflow

CI validates artifact
→ Git repository updated
→ GitOps controller detects change
→ Cluster reconciles desired state

---

# Operational Benefits

GitOps improves:
- consistency
- deployment governance
- observability
- and recovery behavior.

---

# Key Insight

GitOps separates artifact validation from production reconciliation safely.
