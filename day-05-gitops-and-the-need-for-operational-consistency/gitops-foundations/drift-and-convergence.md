# Drift and Convergence

Distributed systems naturally drift away from intended operational state over time.

This occurs through:
- manual modifications
- failed updates
- inconsistent environments
- infrastructure mutations
- and partial operational recovery

Drift is one of the largest operational reliability challenges.

---

# What Is Operational Drift

Operational drift occurs when:
- actual system behavior
no longer matches:
- declared intended configuration

Examples include:
- manual kubectl changes
- undeclared infrastructure modifications
- stale manifests
- or configuration inconsistencies

---

# Why Drift Is Dangerous

Drift creates:
- unpredictable behavior
- debugging difficulty
- inconsistent recovery
- and operational uncertainty

Large distributed systems become increasingly unstable when operational state diverges continuously.

---

# Convergence Model

Convergence means:
- continuously attempting restoration toward intended state

Controllers:
- detect differences
- identify drift
- and reconcile systems

toward operational correctness.

---

# Kubernetes Perspective

Kubernetes continuously operates through convergence.

Controllers attempt to:
- maintain replicas
- restore failed workloads
- and preserve intended system behavior

GitOps extends this convergence model toward operational management.

---

# Reliability Engineering

Reliable platforms continuously:
- detect drift
- reconcile inconsistencies
- and restore operational state predictably

This improves:
- stability
- auditability
- and recovery reliability

inside distributed environments.

---

# Key Insight

Distributed systems naturally drift.

GitOps continuously attempts convergence toward operational consistency and correctness.
