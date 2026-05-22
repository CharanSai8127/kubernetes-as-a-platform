# Manual Console Modifications

Infrastructure drift frequently begins through:
- manual console changes.

These changes bypass:
- declarative infrastructure workflows.

---

# Common Examples

Examples include:
- manually deleting resources
- modifying security groups
- changing IAM permissions
- updating route tables
- or creating unmanaged infrastructure.

---

# Why This Is Dangerous

Terraform state may still assume:
- infrastructure exists in its previous form.

This creates:
- state inconsistency
- broken mappings
- and deployment unpredictability.

---

# Operational Risks

Manual modifications may introduce:
- configuration drift
- orphaned resources
- security inconsistencies
- and failed deployments.

---

# Safer Operational Approach

Infrastructure changes should remain:
- version-controlled
- reviewable
- and declarative.

---

# Key Insight

Manual infrastructure mutation increases operational unpredictability over time.
