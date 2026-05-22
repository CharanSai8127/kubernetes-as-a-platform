# What Is Infrastructure Drift

Infrastructure drift occurs when:
- runtime infrastructure diverges
from:
- the declared desired infrastructure state.

---

# Common Causes

Examples include:
- manual console modifications
- resource deletion outside Terraform
- manually added resources
- security group changes
- IAM modifications
- and subnet updates.

---

# Why Drift Matters

Drift creates:
- operational inconsistency
- debugging difficulty
- deployment unpredictability
- and recovery complexity.

---

# Operational Consequences

Terraform state and runtime infrastructure slowly become:
- inconsistent.

This increases:
- operational uncertainty.

---

# Platform Engineering Perspective

Drift is one of the biggest challenges in:
- large-scale infrastructure management.

---

# Key Insight

Infrastructure drift reduces operational predictability significantly.
