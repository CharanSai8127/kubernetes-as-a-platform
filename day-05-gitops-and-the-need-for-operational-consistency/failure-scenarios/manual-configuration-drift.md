# Manual Configuration Drift

One of the most common causes of operational inconsistency is manual configuration drift.

Distributed systems frequently drift when:
- engineers apply manual fixes
- kubectl changes bypass Git
- or production mutations remain undocumented

This creates divergence between:
- intended state
- and actual operational behavior.

---

# Why Drift Is Dangerous

Manual changes introduce:
- unpredictability
- inconsistent recovery
- debugging difficulty
- and operational uncertainty

inside distributed systems.

Environments gradually stop behaving consistently.

---

# Kubernetes Perspective

Kubernetes continuously reconciles workloads.

However, manual operational changes may still:
- override intended behavior
- modify resources directly
- or bypass reconciliation workflows

This creates hidden operational divergence.

---

# GitOps Relationship

GitOps continuously compares:
- Git state
against:
- cluster state

When manual mutations occur:
systems become:
- OutOfSync

Controllers then attempt restoration toward intended operational state.

---

# Reliability Engineering

Reliable systems depend heavily on:
- centralized operational management
- controlled reconciliation
- and continuous drift correction

during production operations.

---

# Key Insight

Distributed systems naturally drift through manual operational mutation unless reconciliation continuously restores consistency.
