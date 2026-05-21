# Configuration Drift Caused Outage

Manual infrastructure changes may create:
- deployment drift across environments.

Over time this introduces:
- inconsistent runtime behavior.

---

# Failure Flow

Manual production change applied
→ Desired Git state differs from runtime state
→ New deployment introduced
→ Inconsistent configuration causes instability
→ Rollout behavior becomes unpredictable

---

# Why Drift Is Dangerous

Operational drift creates:
- debugging complexity
- rollback difficulty
- and deployment inconsistency.

---

# GitOps Advantage

GitOps continuously reconciles:
- runtime environments
toward:
- declarative desired state.

This reduces:
- uncontrolled operational mutation.

---

# Operational Benefits

Declarative reconciliation improves:
- consistency
- visibility
- and deployment governance.

---

# Key Insight

Operational consistency depends heavily on controlling infrastructure drift.
